import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        final int size=99999;
        int[] numList=new int[size];
        boolean[] isPrimeList=new boolean[size];
        boolean[] simu2017List=new boolean[size];
        int[] cumuList=new int[size];
        for(int i=0;i<size;i++){
            numList[i]=i+2;
            isPrimeList[i]=true;
            simu2017List[i]=false;
        }
        for(int i=0;i<size;i++){
            int oriNum=i+2;
            if(isPrimeList[i]==true){
                for(int j=i+oriNum;j<size;j=j+oriNum){
                    isPrimeList[j]=false;
                }
            }
        }
        for(int i=0;i<size;i++){
            int oriNum=i+2;
            if(oriNum%2==0) continue;
            int index=(oriNum+1)/2-2;
            if(isPrimeList[i]){
                if(isPrimeList[index]){
                    simu2017List[i]=true;
                }
            }
        }
        cumuList[0]=0;
        for(int i=1;i<size;i++){
            cumuList[i]=simu2017List[i]?cumuList[i-1]+1:cumuList[i-1];
        }
/*
        System.out.println("numList");
        Arrays.stream(numList).forEach((a)->{
                System.out.print(a+" ");
        });
        System.out.println();
        System.out.println("isPrimeList");
        for(int i=0;i<isPrimeList.length;i++){
            System.out.print(isPrimeList[i]+" ");
        }
        System.out.println();
        System.out.println("simu2017List");
        for(int i=0;i<simu2017List.length;i++){
            System.out.print(simu2017List[i]+" ");
        }
        System.out.println();
        System.out.println("cumuList");
        Arrays.stream(cumuList).forEach((a)->{
            System.out.print(a+" ");
        });
        System.out.println();
*/

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            int l=scanner.nextInt();
            int r=scanner.nextInt();
            if(simu2017List[l==1?0:l-2]){
                System.out.println(cumuList[r-2]-cumuList[l==1?0:l-2]+1);
            }else{
                System.out.println(cumuList[r-2]-cumuList[l==1?0:l-2]);

            }
        }

    }
}
