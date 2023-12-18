import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=0;
        if(sc.hasNextInt())
        {
            N=sc.nextInt();
        }
        int[]Arr=new int[N];
        for(int i=0;i<N;i++)
        {
            Arr[i]=sc.nextInt();
        }
        ArrayList<Integer> Arr1=new ArrayList<>();
          //int[]Arr1=new int[N];
          for(int i=0;i<N;i++)
          {
              for(int j=0;j<N;j++)
              {
                  if(Arr[j]==i+1)
                  {
                      Arr1.add(j+1);
                  }
              }
          }
          for(int i=0;i<N;i++)
          {
          System.out.print(Arr1.get(i));
          }
 
        // TODO code application logic here
    }
    
}