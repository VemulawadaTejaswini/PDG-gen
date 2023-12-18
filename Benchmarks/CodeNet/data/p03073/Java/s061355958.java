import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        char[]c = s.toCharArray();
        int count0 = 0;
        int count1 = 0;
        
        if(c[0] == '0'){
            for(int i = 1; i < c.length; i++) {
              if(i % 2 == 1){
                if( c[i] == '0'){
                    count0++;
                }
              }else{
                if( c[i] == '1'){
                    count0++;
                } 
              }
            }   
        }
        if(c[0] == '1'){
            for(int i = 1; i < c.length; i++) {
              if(i % 2 == 1){
                if( c[i] == '1'){
                    count1++;
                }
              }else{
                if( c[i] == '0'){
                    count1++;
                } 
              }
            }
            
        }
        System.out.println(Math.max(count0, count1));
    }
}  
  