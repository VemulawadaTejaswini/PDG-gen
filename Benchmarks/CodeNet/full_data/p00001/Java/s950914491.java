
public class Main {

    public static void main(String[] a){
        try{
            String sub = "";
            int start = 0;
            for(int k=0;k<9;k++){
 
                for (int i = 0; i < 9; i++) {
                    long num1 = Long.parseLong(a[i]);
                    long num2 = Long.parseLong(a[i+1]);
                    if (num1<num2) {
                        sub = a[i+1];
                        a[i+1]=a[i];
                        a[i] = sub;
                    }
                }
                if(start>9)break;
                start++;
            }
        }catch(Exception e){
        }
        for (int i = 0; i < 3; i++) {
            String string = a[i];
            System.out.println(string);
        }
    }

}