import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		Deque<Integer> pre_ = new ArrayDeque<>();
		for(int i=0;i<N;i++){
			pre_.addFirst(Integer.parseInt(sc.next()));
		}

		
		
		int ans =0;
		for(int i=0;i<=K;i++){
			//i個(0<=i<=K)取り出す。（K-i個押し戻すことができる）
			for(int j=0;j<=i;j++){
				//左からｊ個取り出す(右からi-j個取り出す)
				Deque<Integer> pre = new ArrayDeque<>();
				Queue<Integer> hand = new PriorityQueue<>();
				for(int p : pre_){
					pre.addFirst(p);
				}
				for(int left=0;left<j;left++){
					int get = pre.pollFirst();
					hand.add(get);
				}
				for(int right=0;right<i-j;right++){
					int get = pre.pollLast();
					hand.add(get);
				}
				//最大K-i個分消す。マイナスだったら消す
				int count =1;
				while(count <= K-i){
					if (hand.size() == 0)break;
					int min = hand.peek();
					if(min < 0){
						count++;
						hand.poll();
					}else{
						break;
					}
				}
				int tmp_ans = 0;
				for(int p : hand){
					tmp_ans += p;
				}
				ans = Math.max(ans, tmp_ans);
			}
			
		}
		
		System.out.println(ans);
		
		
		
	}
	
}

