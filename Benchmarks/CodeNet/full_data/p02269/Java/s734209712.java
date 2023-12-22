import java.util.*;


public class Main{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        String str = "";    
        String text;
        String word;
        int count=0;
        
        count = sc.nextInt();

        for(int i=0;i<count;i++){
            str = sc.next();
            if(str.equals("insert")){
                word = sc.next();
                set.add(word);

            }else if(str.equals("find")){
                word = sc.next();
                if(set.contains(word)==true){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }

        sc.close();
    }
}
