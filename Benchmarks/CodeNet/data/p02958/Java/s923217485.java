import java.util.*;

class Main{
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int num = sc.nextInt();
        List<Integer> alist = new ArrayList<Integer>();
        for(int i = 0; i < num;i++) {
        	alist.add(sc.nextInt());
        }
for(int i =0;i < num;i++) {
	int c = 1;
	if(alist.get(i)==c) {
		cnt++;
	}
	c++;
}        


	if(cnt <= 2) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}
	
	}