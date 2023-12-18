import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int suma=0;
      	int populares=0;
		int n = sc.nextInt();
		int m = sc.nextInt();
      	int a[] = new int[n];      	
		for(int i=0;i<n;i++)
        {
          a[i]= sc.nextInt();
          suma+=a[i];
        }
      for(int j: a)
        {
          if(j>=suma/(4*m))
          {
            populares+=1;
          }
        }
      	if(populares>=m)
        {
          System.out.println(("Yes")); 
        }else if(populares<m)
        {
          System.out.println(("No"));
        }
		
	}
}
