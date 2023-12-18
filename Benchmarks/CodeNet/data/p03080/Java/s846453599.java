import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();

        String[] txt = new String[105];

        int Rcount = 0;
        int Bcount = 0;

        for(int i = 0; i < b.length(); i++){
            txt[i] = String.valueOf(str.charAt(i));

            if(txt[i].equals("R")){
                Rcount = Rcount + 1;
            }
            if(txt[i].equals("B")){
                Bcount = Bcount + 1;
            }
        }
        if(Rcount > Bcount){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }           
    }
}