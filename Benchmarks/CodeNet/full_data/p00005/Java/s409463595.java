import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        System.out.println(gcd(a,b) + " " + lcm(a,b));
                }   
                sc.close();
        }   
        static int gcd(int a, int b){
                if(a < b){ 
                        int tmp = a;
                        a = b;
                        b = tmp;
                }   
                do{ 
                        int r = a%b;
                        a = b;
                        b = r;
                }while(b != 0); 
                return a;
        }   
        static int lcm(int a, int b){
                int _a = a;
                int _b = b;
                while(_a != _b){
                        if(_a < _b){
                                _a += a;
                        }else{
                                _b += b;
                        }   
                }   
                return _a; 
        }   
}