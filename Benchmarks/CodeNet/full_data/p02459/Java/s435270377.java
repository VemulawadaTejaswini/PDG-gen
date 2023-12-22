import java.util.*;


public class Main {
	public static void main(String[] aargs) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer>A=new HashMap<>();
		int a=sc.nextInt();
		int q,x;
        String key;
		for(int i=0;i<a;i++) {
			q=sc.nextInt();
		if(q==0){
            key = sc.next();
            x = sc.nextInt();
            A.put(key,x);
		}else if(q==1){
            key = sc.next();
            System.out.println(A.get(key));
        }
        }
		
	}
}

