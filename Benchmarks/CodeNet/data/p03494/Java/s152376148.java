import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int iin = sc.nextInt();
        int ikflg = 0;
		long[] iia = new long[iin];
        for(int i=0;i<iin;i++){
          iia[i] = sc.nextLong();
          if(iia[i]%2==1){
            ikflg = 1;
            break;
          }
        }
        int iret = 0;
        for(;ikflg==0;){
          iret++;
          for(int i=0;i<iin;i++){
            iia[i] /= 2;
            if(iia[i]%2==1){
              ikflg = 1;
              break;
            }
          }
		}
		System.out.println(iret);
    }
}
