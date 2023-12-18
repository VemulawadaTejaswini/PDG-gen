import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[];
      	int c;
      	b = new int[a];
      	int total=0;
		for(int i=0; i<a; i++){
			b[i] = sc.nextInt();
		}
      	for(int i=0; i<a; i++)
        {
          for(int j=i+1;j<a;j++)
          {            
            c=b[i]*b[j];
            total+=c;
          }
        }
		System.out.println(total);
	}
}