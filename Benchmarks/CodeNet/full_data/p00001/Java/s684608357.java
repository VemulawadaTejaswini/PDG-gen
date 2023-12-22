
public class Main {

    public static void main(String[] a){
        try{
            String sub = "";
            for(int k=0;k<a.length-1;k++){
 
                for (int i = k+1; i < a.length; i++) {
                    long num1 = Long.parseLong(a[k]);
                    long num2 = Long.parseLong(a[i]);
                    if (num1<num2) {
                        sub = a[i];
                        a[i]=a[k];
                        a[k] = sub;
                    }
                }
            }
        }catch(Exception e){
        }
        for (int i = 0; i < 3; i++) {
            String string = a[i];
            System.out.println(string);
        }
    }

}