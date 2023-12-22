

import java.util.Scanner;
 class Mega_A {

  
    public static void main(String[] args) {
   
        Scanner scan = new Scanner(System.in);
        int i,j,temp;
        int data[] = new int[10];
        
        for(i=0;i<10;i++)
        {
            data[i] = scan.nextInt();
        }
        
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if(data[i]< data[j])
                {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                }
            }
        }
        
        for(i=0;i<10;i++)
        {
            System.out.println(data[i]);
        }
        
        
        
    }
    
}