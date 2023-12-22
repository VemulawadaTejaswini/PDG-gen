import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        int i;

        for(i=0;i<n1;i++){
            array1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        int j;

        for(j=0;j<n2;j++){
            array2[j] = sc.nextInt();
        }

        int testdata,count,sum=0,position,start,end;

        for(j=0;j<n2;j++){
            testdata = array2[j];
            count=n1;
            start = 0;
            end = n1-1;
            position=(start+end)/2;

            while(count>0){
                if(array1[position]==testdata){
                    sum += 1;
                    break;
                }else{
                    if(array1[position]>testdata){
                        end=position-1;
                    }else{
                        start=position+1;
                    }
                position=(start+end)/2;
                count/=2;
                }
            }

        }

        System.out.printf("%d\n",sum);

    }
}

