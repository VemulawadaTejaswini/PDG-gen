
import java.util.*;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] strings=scanner.next().split("");
        int[] ints=new int[strings.length];
        for(int i=0;i<ints.length;i++){
            ints[i]=Integer.parseInt(strings[i]);
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    int result=ints[0];
                    String[] opt=new String[3];
                    if(i==0){
                        opt[0]="+";
                        result+=ints[1];
                    }else{
                        opt[0]="-";
                        result-=ints[1];
                    }
                    if(j==0){
                        opt[1]="+";
                        result+=ints[2];
                    }else{
                        opt[1]="-";
                        result-=ints[2];
                    }
                    if(k==0){
                        opt[2]="+";
                        result+=ints[3];
                    }else{
                        opt[2]="-";
                        result-=ints[3];
                    }
                    if(result==7){
                        for(int l=0;l<3;l++){
                            System.out.print(String.format("%d%s",ints[l],opt[l]));
                        }
                        System.out.print(String.format("%d=7",ints[3]));
                        return;
                    }
                }
            }
        }
    }
}