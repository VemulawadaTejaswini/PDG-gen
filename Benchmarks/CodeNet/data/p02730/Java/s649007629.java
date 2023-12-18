import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        String[] strArray = str.split("");
        int strLength = strArray.length;
        boolean result = true;

        for(int i = 0; i < strLength / 2;i++){
            if(strArray[i].equals(strArray[strLength - i - 1])){}
            else{result = false; break;}
        }

    if(result && strLength > 3){
        int kai1 = (strLength - 1) / 2;
        for(int i = 0; i < kai1 / 2 ;i++){
            if(strArray[i].equals(strArray[kai1 - i - 1])){}
            else {result = false; break;}
        }

        int kai2 = (strLength + 3) / 2;
        if(result){
            int count = 0;
            for(int i = kai2 - 1; i < strLength - (kai1 / 2) ; i++){
                if(strArray[i].equals(strArray[strLength - count - 1])){}
                else {result = false; break;}
                count++;
            }
        }
    }

    if(result) System.out.println("Yes");
    else System.out.println("No");
    }
}