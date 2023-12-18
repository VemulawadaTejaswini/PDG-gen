import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int iin = sc.nextInt();
		int iia = sc.nextInt();
		int iib = sc.nextInt();
        int retint = 0;
        iin++;
        for(int i=1;i<iin;i++){
            int kari = i;
            int kariketa = 0;
            while(true){
                kariketa += kari % 10;
                kari /= 10;
                if(kari == 0){
                    break;
                }
            }
            if(kariketa >= iia && kariketa <= iib){
                retint += i;
            }
        }
		System.out.println(retint);
    }
}
