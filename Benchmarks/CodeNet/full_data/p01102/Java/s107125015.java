import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        while(true){
            String po=s.nextLine();
            if(po==".") break;
            String po2=s.nextLine();
            if(po.equals(po2)) System.out.println("IDENTICAL");
            else{
                char a[]=po.toCharArray();
                char b[]=po2.toCharArray();
                int len=Math.min(po.length(),po2.length());
                int i=0,j=0,miss=0;
                while(i<len&&j<len){
                    if(a[i]!=b[j]){
                        miss=-1;
                        break;
                    }
                    if(a[i]=='"'){
                        i++; j++;
                        if(a[i]=='"'^b[j]=='"'){
                            miss++;
                        }else{
                            while(a[i]!='"'&&b[j]!='"'){
                                if(a[i]!=b[j]){
                                    miss++;
                                    break;
                                }
                                i++; j++;
                            }
                        }
                        while(a[i]!='"'){ i++; }
                        while(b[j]!='"'){ j++; }
                    }
                    i++; j++;
                }
                if(miss==1) System.out.println("CLOSE");
                else System.out.println("DIFFERENT");
            }
        }
    }
}
