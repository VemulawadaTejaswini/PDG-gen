import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	boolean flg = true;
		String words[] = new String[N];
      	for(int i=0;i<N;i++){
        	words[i] = sc.next();
        }
      	ArrayList<String> list = new ArrayList<String>();
      	list.add(words[0]);
      	for(int i=0;i<N-1;i++){
        	if(words[i].charAt(words[i].length()-1)!=words[i+1].charAt(0)||list.contains(words[i+1])){
                System.out.println("No");
                flg = false;
                break;
             }else{
                list.add(words[i+1]);
            }
        }
      	if(flg){
        	System.out.println("Yes");
        }
    }
}