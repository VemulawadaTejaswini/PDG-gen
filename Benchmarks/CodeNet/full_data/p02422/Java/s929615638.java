import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int commandNum = sc.nextInt();//命令の数
// System.out.println(str);

        for(int i = 0; i < commandNum; i++){
            String strCommand = sc.next();
// System.out.println("strCommand " + strCommand);
//            String[] part = strCommand.split(" ");
  
/*  for(String p :part){
     System.out.println(p);
} */
            if(strCommand.startsWith("print")){
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(str.substring(a,b+1));
// System.out.println(str);
            }
            else if(strCommand.startsWith("reverse")){
                int a = sc.nextInt();
                int b = sc.nextInt();                
                String copy = str.substring(a,b+1);
                char[] preReverse = copy.toCharArray();
                String reverseCopy ="";
                
                for(int j = copy.length() -1; j >= 0; j--){
                    reverseCopy = reverseCopy + preReverse[j]; 
 //System.out.println("reverseCopy " + reverseCopy);
                    
                }
                    String strAns = str.replace(copy, reverseCopy);
                    str = strAns;
 //System.out.println(strAns);
            }
            else if(strCommand.startsWith("replace")){
                int a = sc.nextInt();
                int b = sc.nextInt();
                String c = sc.next();
                String copy = str.substring(a,b+1);
//    System.out.println("c " + c);
 //   System.out.println("copy " + copy);
                String first = str.substring(0,a);
                String last = str.substring(b+1,str.length());    
                String replaceCopy = first + c + last;
//    System.out.println("replaceCopy " + replaceCopy);
                
                str = replaceCopy;
                replaceCopy="";
            }
        }
    }
}


                

