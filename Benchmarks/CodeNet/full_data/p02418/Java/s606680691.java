import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String str = s+s;
        String p = sc.nextLine();
        int i;
        int j;
        int count=0;
        
        String[] strArray = str.split("");
        String[] pArray = p.split("");
//        String[] check = new check[p.length];
        String check ="";
 //     while(sc.hasNextLine()){      
        for(i = 0; i < s.length(); i++){
            if(pArray[0].equalsIgnoreCase(strArray[i])){   
                for(j=0; j < p.length(); j++){
                    check += strArray[i+j];
//                        System.out.println(check);
                    }if(p.equals(check)){
                        count++;
                    }
                    check = "";
            }
        }
        if(count==0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
                        

