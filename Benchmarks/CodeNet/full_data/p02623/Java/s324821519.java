import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Long> a=new ArrayList<>();
		ArrayList<Long> b=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextLong());
		}
		for (int i = 0; i < m; i++) {
			b.add(sc.nextLong());
		}
		long time=0;
		long flag = 0;
		while ((a.size()!=0)||(b.size()!=0)) {
			if(a.size()==0){
				if(k>=time+b.get(0)){
					time=time+b.get(0);
					flag++;
					b.remove(0);
				}
				else{break;}
			}
			else if(b.size()==0){
				if(k>=time+a.get(0)){
					time=time+a.get(0);
					flag++;
					a.remove(0);
				}
				else{break;}
			}
			else{
			if(k>=(time+Math.min(a.get(0),b.get(0)))){
				time=time+Math.min(a.get(0), b.get(0));
				if(a.get(0)>b.get(0)){b.remove(0);}
				else if(b.get(0)>a.get(0)){a.remove(0);}
				else{
                  int i=1;
					while(true){
						if(a.size()<i+1&&b.size()<i+1){a.remove(0);break;}
						else if(a.size()<i+1){b.remove(0);break;}
						else if(b.size()<i+1){a.remove(0);break;}
						else{
							if(a.get(0)>b.get(0)){b.remove(0);break;}
							else if(b.get(0)>a.get(0)){a.remove(0);break;}
							else{i++;}
						}
					}
				}
				flag++;
			}
			else{break;}
			}
		}
		System.out.println(""+flag);
	}
}