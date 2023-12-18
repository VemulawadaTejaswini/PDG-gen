

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        String str=scanner.next();

        List<Integer> list=new ArrayList<>();
        str=str.trim();
        for(int j=0;j<t;j++){
            list.add(j,Integer.parseInt(String.valueOf(str.charAt(j))));
        }
        while (true){
            List<Integer> ar=new ArrayList<>();
            int fl=0;

            for(int j=0;j<list.size()-1;j++){

                    ar.add(j,(int)Math.abs(list.get(j)-list.get(j+1)));
                if(ar.get(j)==1 || ar.get(j)==0) {
                    fl++;
                }
//            }

            }

            if(ar.size()==1){
                System.out.println(ar.get(0));
                break;
            }
//
            if(ar.size()==2){
                System.out.println(Math.abs(ar.get(0)-ar.get(1)));
                break;
            }
            if(fl==ar.size()){
                System.out.println(0);
                // System.out.println(11);
                break;
            }
            list=new ArrayList<>();
            list.add(0,ar.get(0));

            int cc=1;

//            if(ar.get(0)==1 || ar.get(0)==0){
//                fl=1;
//            }
            for(int j=1;j<ar.size();j++){
                if(j!=ar.size()-1 && ar.get(j-1)==0 && ar.get(j+1)==0){
                    continue;
                }

                list.add(cc,ar.get(j));
//                if(list.get(cc)==0 || list.get(cc)==1){
//                    fl++;
//                }
                cc++;
            }
            if(list.size()==1){
                System.out.println(list.get(0));
                break;
            }
            if(list.size()==2){
                System.out.println(Math.abs(list.get(0)-list.get(1)));
                break;
            }
//            if(fl==list.size() ){
//                System.out.println(0);
//                break;
//            }

        }

    }

}
