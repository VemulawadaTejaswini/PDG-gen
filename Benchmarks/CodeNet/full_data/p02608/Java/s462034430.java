import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
      	int a = Integer.parseInt(sc.nextLine());
      	int result[] = new int[a];
      	for(int i = 1; a >= i * i + 2 * i + 3; i++)
        {
         	for(int j = 1; j <= i; j++)
            {
              	for(int k = 1; k <= j; k++)
                {
                  	if(calc( k, j, i) > a)
                    {
                      
                    }else if(k != j && k != i && j != i){
                      	result[calc(k, j, i) - 1] += 6;
                    }else if(k != j || k != i || j != i){
                      	result[calc(k, j, i) - 1] += 3;
                    }else{
                      	result[calc(k, j, i) - 1] += 1;
                    }
                      
                }
            }
        }
      	for(int o = 0; o < a; o++)
        {
         	 System.out.println(result[o]);
        }
    }
  
  	public static int calc(int x, int y, int z)
    {
     	return ( x + y + z ) * ( x + y + z ) - x * y - x * z - y * z; 
    }
}