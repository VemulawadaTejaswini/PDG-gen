import java.util.*;
public class Main{
    public static void main(String sp[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		boolean b=false;
		al.add(0);
		for(int i=0;i<n;i++){
			int temp = sc.nextInt();
			al.add(temp);
			if(temp==0)
				b=true;
		}
		
		if(b==true){
			System.out.println("0");
			return;
		}
		
		for(int i=1;i<=n;i++){
			int temp = al.get(i);
			int total=0;
			for(int j=i;j<=n;j+=i){
				total+=al.get(j);
			}
			total=total%2;
			if(temp==total){
				System.out.println(temp);
				return;
			}
		}
		System.out.println("-1");
		
	}
}