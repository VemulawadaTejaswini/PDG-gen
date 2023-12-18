import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        ArrayList<Integer> Array = new ArrayList<Integer>();
        ArrayList<String> S_Array = new ArrayList<String>();
        ArrayList<Integer> Number = new ArrayList<Integer>();
        
        for(int i = 0; i<num1;i++){
            String str = scan.next();
            int num3 = scan.nextInt();

            if(Array.size() == 0){
                Array.add(num3);
                S_Array.add(str);
                Number.add(i+1);
            }
            else{
                int j = 0;
                while(j+1 <= Array.size()){
                    if(S_Array.get(j).compareTo(str) >= 0){
                        if(S_Array.get(j).compareTo(str) == 0){
                            if(Array.get(j) > num3){
                                Array.add(j+1,num3);
                                S_Array.add(j+1,str);
                                Number.add(j+1,i+1);
                                break;
                            }
                            else{
                                Array.add(j,num3);
                                S_Array.add(j,str);
                                Number.add(j,i+1);
                                break;
                            }
                        }
                        else{
                            Array.add(j,num3);
                            S_Array.add(j,str);
                            Number.add(j,i+1);
                            break;
                        }
                    }
                    else{
                        j++;
                    }
                }
                if(j == Array.size()){
                    Array.add(num3);
                    S_Array.add(str);
                    Number.add(i+1);
                }
            }
        }
        for(int i :Number)
        System.out.println(i);

    }
}