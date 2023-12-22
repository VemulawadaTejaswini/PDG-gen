public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        //int n = Integer.parseInt(sc.nextLine());
        
        String  str[] = new String[3];
        
        
        //for(int i = 0; i < 3 ; i++){
        //    str[i] = sc.next();
        //}
        //
        //int A= Integer.parseInt(str[0]);
        //int B= Integer.parseInt(str[1]);
        //int C= Integer.parseInt(str[2]);

       //for(int i = 0; i < 3 ; i++){
       //    System.out.println(str[i]);
       // }
        
        int A = sc.nextInt();
        int B =sc.nextInt();
        int C = sc.nextInt();
        
        int k = sc.nextInt();
        
        //System.out.println(A);  
        //System.out.println(B);  
        //System.out.println(C);  
        //System.out.println(k);  
        
        int nokori = k;
        
        for(int i = 0; i < k ; i++){
            if( B > A){
                break;  
            }else{
                B = B + B;
                nokori = nokori - 1;
            }
       }
       
       if(nokori >0){
           for(int i = 0; i < nokori ; i++){
               if( C > B){
                   break;  
               }else{
                   C = C + C;
               }
               
           }
          
       }
           
           //System.out.println("totyu");  
   
           //System.out.println(A);  
           //System.out.println(B);  
           //System.out.println(C); 
           
           
       if( A < B ){
           
           if(B<C){
               System.out.println("Yes");  
           }else{
               System.out.println("No");  
           }
       }else{
           System.out.println("No");  
       }
       
       }
       
           

}