import java.util.Scanner;
import java.util.ArrayList;
 
 
public class Main {
     
    static String change(String str){
        StringBuffer sb = new StringBuffer(str);
        str = sb.reverse().toString();
        return str;
    }
     
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            for(int i=0;i<m;i++) {
                String tomas = sc.next();
                ArrayList<String> pettern = new ArrayList<>();
                 
                String s = "";
                 
                for(int j=0;j<tomas.length()-1;j++) {
                    for(int k=0;k<8;k++) {
                        switch(k) {
                        case 0:
                            s = change(tomas.substring(0,j+1)) + change(tomas.substring(j+1,tomas.length()));
                            pettern.add(s);
                            break;
                             
                        case 1:
                            s = change(tomas.substring(0,j+1)) + tomas.substring(j+1,tomas.length());
                            pettern.add(s);
                            break;
                                 
                             
                        case 2:
                            s = tomas.substring(0,j+1) + change(tomas.substring(j+1,tomas.length()));
                            pettern.add(s);
                            break;
                             
                        case 3:
                            s = tomas.substring(0,j+1) + tomas.substring(j+1,tomas.length());
                            pettern.add(s);
                            break;
                             
                        case 4:
                            s = change(tomas.substring(j+1,tomas.length())) +  change(tomas.substring(0,j+1)) ;
                            pettern.add(s);
                            break;
                             
                        case 5:
                            s = tomas.substring(j+1,tomas.length()) + change(tomas.substring(0,j+1)) ;
                            pettern.add(s);
                            break;
                                 
                             
                        case 6:
                            s =  change(tomas.substring(j+1,tomas.length())) + tomas.substring(0,j+1) ;
                            pettern.add(s);
                            break;
                             
                        case 7:
                            s = tomas.substring(j+1,tomas.length()) + tomas.substring(0,j+1) ;
                            pettern.add(s);
                            break;
                             
                        }
                    }
                }
                //System.out.print(pettern);
                 
                for(int l=0;l<pettern.size()-1;l++) {
                    for(int n=l+1;n<pettern.size();n++) {
                        if(pettern.get(l).equals(pettern.get(n))) pettern.set(n,"A");
                    }
                }
                 
                int count=0;
                for(int l=0;l<pettern.size();l++) {
                    if(!pettern.get(l).equals("A")) count++;
                }
                 
                System.out.println(count);
                 
            }
        }
 
    }
