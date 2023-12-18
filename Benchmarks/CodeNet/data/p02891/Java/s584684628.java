import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder s = new StringBuilder(scanner.nextLine());

        

        long k = scanner.nextLong();

        
        int i = 0;

        long all = 0;

        //先頭からつながった数を数える
        long first = 0;
        for(i = 0; i < s.length()-1; i++){
            if(s.substring(i, i+1).equals(s.substring(i+1, i+2))){
                first++;
            }else{break;}
        }
        //繋がっていないならば
        long last = 0;
        long connected = 0;
        List<Long> middleList = new ArrayList<Long>();
        if(i != (s.length()-1)){

            //最初と最後以外でつながっている部分が無いか調べる
            long middle = 0;
            for(; i < s.length()-1; i++){
                if(s.substring(i, i+1).equals(s.substring(i+1, i+2))){
                    middle++;
                }else if(middle != 0){
                    middleList.add(middle);
                    middle = 0;
                }
            }


            //末尾からつながった数を数える
            for(i = s.length()-1; i != 0; i--){
                if(s.substring(i, i+1).equals(s.substring(i-1, i))){
                    last++;
                }else{
                    break;
                }
            }

            //繋がった際の数を数える
            if(s.substring(0, 1).equals(s.substring(s.length()-1))){
                //先頭文字がどれだけ同じか調べる
                connected += 2;
                
                for(i = 0; i < s.length()-1; i++){
                    if(s.substring(i, i+1).equals(s.substring(i+1, i+2))){
                        connected++;
                    }else{
                        break;
                    }
                }
                //最後まで到達していなければ後ろからも調べる

                for(i = s.length()-1; i != 0; i--){
                    if(s.substring(i, i+1).equals(s.substring(i-1, i))){
                        connected++;
                    }else{
                        break;
                    }
                }


            }


        }else{
            first = 0;
            all = (long)s.length();
        }

        long middleSum = 0;
        for(long sum : middleList){
            System.out.println("middle:" + sum);
            middleSum += ((sum+1) /2 * k);
        }
        first++;
        last++;
        System.out.println("first:" + first + " last:" + last + " middleSum:" + middleSum + " connected:" + connected);
        System.out.println(first/2 + last/2 + (middleSum) + connected * (k-1)/2 + (all * k / 2));

        
        scanner.close();
    }
}