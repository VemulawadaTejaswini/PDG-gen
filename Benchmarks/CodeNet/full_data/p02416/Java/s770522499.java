import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInt = 0;
        int sumNum = 0;
        while(true){
            String numString = sc.next();
            if(numString.equals("0")){
                break;
            }
            for(int i = 0; i<numString.length(); i++){
                numInt = Integer.parseInt(numString.substring(i,i+1));
                if(i == 0){
                    sumNum = numInt;
                }else{
                    sumNum += numInt;
                }
            }
            System.out.println(sumNum);
        }
    }
}
