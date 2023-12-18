import java.util.Scanner;
public class Main{
  class city{
    String name;
    int sc;
    int id;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N,i,j;
    N = sc.nextInt();
    city[] C = new city[N];
    int temp;
    for(i=0;i<N;i++){
      C[i].name = sc.nextLine();
      C[i].sc = sc.nextInt();
      C[i].id = i;
    }
    for (i = 0; i < N; i++) 
        {
            for ( j = i + 1; j < N; j++) 
            {
                if (C[i].name.compareTo(C[j].name)>0) 
                {
                    temp = C[i].id;
                    C[i].id = C[j].id;
                    C[j].id = temp;
                }
            }
        }
    for(i=0;i<N;i++){
      for(j=i+1;j<N;j++){
        if(C[i].name.equals(C[j].name)){
          if(C[i].sc<C[j].sc){
            temp = C[i].id;
            C[i].id = C[j].id;
            C[j].id = temp;
          }
        }
      }
    }
  for(j=0;j<N;j++)
   System.out.println(C[i].id + "\n");
  }
}
    
