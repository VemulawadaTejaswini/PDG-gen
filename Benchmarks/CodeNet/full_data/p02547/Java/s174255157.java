import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		Vector<Integer> v=new Vector();
		//int arr[]=new int [2*t];
		for (int T=0; T<t; T++) {
			int a=ob.nextInt();
			int b=ob.nextInt();
			v.add(a);
			v.add(b);
		}
		v.add(0);
		v.add(0);
		v.add(0);
		v.add(0);
		v.add(0);
		v.add(0);
		v.add(0);
		v.add(0);
		v.add(0);
		v.add(0);
  
		v.add(0);
		v.add(0);
		v.add(0);
		int k=0;
		for (int i=0; i<v.size(); i++) {
			if ((v.get(i)==0&&v.get(i+1)==0)&&(v.get(i+2)==0&&v.get(i+3)==0)&&(v.get(i+4)==0&&v.get(i+5)==0)) {
				k=0;break;
			}
			if (v.get(i)==v.get(i+1)&&v.get(i+2)==v.get(i+3)&&v.get(i+4)==v.get(i+5)) {
			k=1;break;
			}
		}
		if(k==1){System.out.println("YES");}
		else{System.out.println("NO");}
	}
}