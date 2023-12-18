import java.util.*;
import java.lang.*;
public class Main{
public static int hcf(int a, int b) {
		if (b == 0)
			return a;
		else
			return hcf(b, a % b);
	}

	public static int hcf(int a, int b, int c) {

		return hcf(hcf(a, b), c);}
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
    ArrayList<int> val = new ArrayList<int>();
    for (int i=1;i<a;i++){
      if(a%i==0){
      val.add(i);
      }}
    long total=0;
    for(int i=0;i<val.size();i++){
    for(int j=0;j<val.size();j++){
    for(int k=0;k<val.size();k++){
    total+=hcf(i,j,k);
    }
    }
    }
          System.out.println(total);
  }
}
