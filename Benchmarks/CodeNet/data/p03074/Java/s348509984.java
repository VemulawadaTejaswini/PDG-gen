
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
        int count = 1;
        boolean flag = true;
        if(s.charAt(0)=='0'){
        	list.add(0);
        }
        else{
        	flag = false;
        }
        for(int i=1;i<n;i++){
        	if(s.charAt(i)=='0' && flag){
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
        list.add(count);
        if(flag){
        	list.add(0);
        }
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(list.get(0));
        for(int i=1;i<list.size();i++){
        	l.add((list.get(i)+l.get(i-1)));
        }

        int max = 0;
        if(2*k+1>list.size()){
        	max = n;
        }
        else{
        	max = l.get(2*k);
        	for(int i=2;i+2*k<l.size();i+=2){
        		max = (int)Math.max(max, l.get(i+2*k)-l.get(i-1));
        	}
        }

        System.out.println(max);

    }
}