import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] inArray = input.split("");
        String[] outArray = new String[inArray.length];
        int count = 0;
        int inArraycount = 0;
        String currentStr = "";
        while(count < inArray.length){
            currentStr = inArray[inArraycount];
            //System.out.println(inArraycount);
            if(currentStr.equals("B")){
                outArray[count-1] = "";//一個前の文字を空に
            }else {
                outArray[count] = currentStr;
            }
            count++;
            inArraycount++;
        }
        //System.out.print(outArray.length+"aaa");
        //output
        for(int i = 0; i < outArray.length; i++){
            //System.out.println(i+"aaa");
            if(outArray[i]==null){
                 
            }else{
                System.out.print(outArray[i]);      
            }
            
        }
    }
}