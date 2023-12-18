import java.util.*;

class main{
	
	public main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int num = sc.nextInt();
        List<Integer> alist = new ArrayList<Integer>();
        for(int i = 0; i <= num;i++) {
        	alist.add(sc.nextInt());
        }
        
	List<Integer> list = new ArrayList<Integer>();
	for(int i = 0;i <=num;i++) {
		list.add(i);
	}
	for(int a : alist){
        for(int b : list){
            if(a==b){
                cnt+=1;
                break;
            }
        }
    }
	if(num - cnt < 2 || num == cnt) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}
	
	}
}