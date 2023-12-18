import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        scanner.close();

        List<String> list = new ArrayList<String>();
        for(int i = 0;i < a.length(); i++){
            list.add(a.substring(i,i+1));
        }
        int count = 0;
        for(;;){
            int bc = count;
            for(int i = 0; i < list.size() - 1; i++){

                if(list.get(i).equals("0") && list.get(i+1).equals("1")){
                    list.remove(i);
                    list.remove(i);
                    count++;
                    break;
                }else if(list.get(i).equals("1") && list.get(i+1).equals("0")){
                    list.remove(i);
                    list.remove(i);
                    count++;
                    break;
                }
            }
            if(bc != count){
                continue;
            }else{
                break;
            }
        }
        System.out.println(count*2);
    }
}
