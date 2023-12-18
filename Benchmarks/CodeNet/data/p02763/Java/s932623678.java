import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int textsize=Integer.parseInt(sc.nextLine());
            String s=sc.nextLine();
            if(textsize==s.length()){
               int query=sc.nextInt();
               ArrayList<Integer> carr=new ArrayList<>();
               for(int i=0;i<query;i++){
                int no=sc.nextInt();
                if(no==1){
                    int p=sc.nextInt();
                    char c=sc.next().charAt(0);
                    if(s.charAt(p-1)!=c)
                        s=s.substring(0,p-1)+c+s.substring(p);
                }
                if(no==2){
                    HashMap<Character,Integer> map=new HashMap<>();
                    int l=sc.nextInt();
                    int r=sc.nextInt();
                    int count=0;
                    String copy=s.substring(l-1, r);
                    for(int j=0;j<copy.length();j++){
                        char c=copy.charAt(j);
                        if(!map.containsKey(c)){
                            map.put(c, 1);
                            count++;
                        }
                    }
                    carr.add(count);
                }
               }
               for(Integer i:carr){
                   System.out.println(i);
               }
            }
	}
}