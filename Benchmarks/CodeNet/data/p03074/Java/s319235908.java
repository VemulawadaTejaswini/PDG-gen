
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
      	ArrayList<Integer> list = new ArrayList<Integer>();
      	int count = 0;
      	boolean flag = true;
      	for(int i=0;i<s.length();i++){
      		if(i==0){
      			if(s.charAt(i)=='0'){
      				count++;
      				list.add(0);
      			}
      			else{
      				count++;
      				flag = false;
      			}
      		}
      		else if(s.charAt(i)=='0' && flag){
      			count++;
      		}
      		else if(s.charAt(i)=='1' && !flag){
      			count++;
      		}
      		else{
      			list.add(count);
      			flag = !flag;
      			count = 1;
      		}
      	}
      	if(flag){
      		list.add(count);
      		list.add(0);
      	}
      	else{
      		list.add(count);
      	}

      	ArrayList<Integer> l = new ArrayList<Integer>();
      	l.add(list.get(0));
      	for(int i=1;i<list.size();i++){
      		l.add((list.get(i)+l.get(i-1)));
      	}
      	int max = 0;
      	if(k+k-1+2>=list.size()){
      		max = n;
      	}
      	else{
      		max = l.get(2*k);
      		for(int i=2;i+2*k<list.size();i+=2){
      			max = (int)Math.max(max, l.get(2*k+i) - l.get(i) + 1);
      		}
      	}

      	System.out.println(max);
    }
}