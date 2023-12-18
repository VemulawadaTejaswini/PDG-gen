    import java.util.Scanner;
    
    class Main {
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            sc.close();
            long count = 0;
            try{
            	 for(long i = a; i <= b; i++ ) {
                 	if(i % x == 0) {
                 		count++;
                 	}
                 }
                 System.out.println(count);
                
                 
            }
            catch (Exception e){
            }
           
        }
    }