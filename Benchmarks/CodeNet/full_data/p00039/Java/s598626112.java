import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                        String s = sc.nextLine();
                        int sum = 0;
                        int prev = 0;
                        for(int i = s.length()-1; i >= 0; i--){
                                int tmp = toInt(s.charAt(i));
                                if(prev > tmp){
                                        sum -= tmp;
                                }else{
                                        sum += tmp;
                                }   
                                prev = tmp;
                        }   
                        System.out.println(sum);
                }   
                sc.close();
        }   
        static int toInt(char c){
                if(c == 'I'){
                        return 1;
                }   
                if(c == 'V'){
                        return 5;
                }   
                if(c == 'X'){
                        return 10; 
                }   
                if(c == 'L'){
                        return 50; 
                }   
                if(c == 'C'){
                        return 100;
                }   
                if(c == 'D'){
                        return 500;
                }   
                if(c == 'M'){
                        return 1000;
                }   
                return 0;
        }   
}