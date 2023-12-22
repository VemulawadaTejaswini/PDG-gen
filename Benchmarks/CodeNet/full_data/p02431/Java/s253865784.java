import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		Al t=new Al();
		 int n=sc.nextInt();
		for(int i=0; i<n; i++){
			int c=sc.nextInt();

			if(c==0){
				int b=sc.nextInt();
				t.pushback(b);
			}else if(c==1){
				int b=sc.nextInt();
				System.out.println(t.randomAccess(b));

			}else{
				t.popback();
			}

		}


	}
}
 class Al{
	 ArrayList<Integer> a=new ArrayList<Integer>();
	 void print(){
		 for(int i=0; i<a.size(); i++){
			 System.out.print(a.get(i));
		 }
		 System.out.println();
	 }
	 void pushback(int b){
			a.add(b);

		}
	void popback(){
			a.remove(a.size()-1);
		}
	int randomAccess(int b){
			return a.get(b);

		}
 }
