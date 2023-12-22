import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int taroScore=0;
        int hanaScore=0;
        while(sc.hasNext()){
            String taro = sc.next();
            String hana = sc.next();
            int score = taro.compareTo(hana);  
            if (score < 0)  
                hanaScore+=3;
            else if (score > 0) 
                    taroScore+=3;
                 else {  
                    hanaScore+=1;
                    taroScore+=1;}
        }
        System.out.println(taroScore +" "+ hanaScore);
    }
}
