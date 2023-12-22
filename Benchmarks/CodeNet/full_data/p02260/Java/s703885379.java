import java.util.*;
class Main{
public static void main(String[] args) {
    Scanner yin = new Scanner(System.in);
    
    
    int N = yin.nextInt();
    int[] num = new int[N];
   
    
    for (int i = 0,j; i < N; i++) {
             num[i] = yin.nextInt();
        }
    
    int suanchang=0;
        
        for(int i = 0; i < num.length-1; i++){
            int min = i;
            
            for(int j = i+1; j <num.length ;j++){
                if(num[j]<num[min]){
                    min = j;
                }
            }
            if(min!=i){
               int temp = num[i];
                num[i] = num[min];
                 num[min] = temp;
                   suanchang++;
            }
        
        }
    

    
    for(int i=0;i<num.length-1;i++){
        System.out.print(num[i] + " ");
   }
        
        
        System.out.print(num[N-1]);
        System.out.println();
        System.out.println(suanchang);
   
    
    
            }

    }
