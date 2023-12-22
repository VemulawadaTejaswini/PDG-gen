

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            char[]numList = br.readLine().toCharArray();
            int m=0;
            if(numList.length<4){
                System.out.print(0);
            }else{
                int sum=0;
                for(int length=4;length<=numList.length;length++){
                    int total;
                    for(int i=0;i<numList.length-length+1;i++){

                        sum=0;
                        for(int j=i;j<length+i;j++){
                            sum+= numList[j]-'0';
                        }
                        if(sum%3==0){
                            total=0;
                            for(int j=i;j<i+length;j++){
                                total+=(numList[j]-'0')*Math.pow(10,length-j+i-1);

                            }
                            if(total%2019==0&&total>0){
                                m++;
                            }
                        }

                    }
                }
            System.out.print(m);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
