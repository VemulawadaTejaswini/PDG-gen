import java.util.*;
 
 class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>(); 
        List<Integer> alist = new ArrayList<Integer>(); 
        for(int i=0; i<=n+1; i++){
        	try {
        	int num = sc.nextInt();
        	list.add(num);
        	}catch(Exception e) {
        		break;
        	}
        }
        for(int i=0; i<=n; i++){
        	try {
        	int num1 = sc.nextInt(); 
            alist.add(num1);
        	}catch(Exception e) {
        		break;
        	}
        }
        int cnt = 0;
        int count =0;
        int s =0;
        for(int i = 0; i <= alist.size();i++) {
        	if(alist.get(i) < list.get(cnt) + list.get(cnt + 1) ) {
        		count = count + alist.get(i);
        		if(list.get(cnt) < alist.get(i)) {
        		s = list.get(cnt + 1) - (alist.get(i)-list.get(cnt));
        		list.set(cnt + 1, s);
        		}
        	}else {
        	count =list.get(cnt) + list.get(cnt + 1);
        	}
        	cnt++;
        }
        System.out.println(count);
    }
}