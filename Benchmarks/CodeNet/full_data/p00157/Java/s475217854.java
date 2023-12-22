import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
        int count = Integer.parseInt(r.readLine().split(" ")[0]);
        System.out.println();
        while(count!=0){
            List<Integer> list_h1 = new ArrayList<Integer>();
            List<Integer> list_r1 = new ArrayList<Integer>();
            List<Integer> list_h2 = new ArrayList<Integer>();
            List<Integer> list_r2 = new ArrayList<Integer>();
            int i;
            for(i=0;i<count;i++){
                String[] tmp = r.readLine().split(" ");
                int tmpi = Integer.parseInt(tmp[0]);
                int index = list_h1.size();
                while(index>0&&tmpi<list_h1.get(index-1)){
                    index--;
                }
                list_h1.add(index, tmpi);
                list_r1.add(index, Integer.parseInt(tmp[1]));
            }
            count = Integer.parseInt(r.readLine().split(" ")[0]);
            for(i=0;i<count;i++){
                String[] tmp = r.readLine().split(" ");
                int tmpi = Integer.parseInt(tmp[0]);
                int index = list_h2.size();
                while(index>0&&tmpi<list_h2.get(index-1)){
                    index--;
                }
                list_h2.add(index, tmpi);
                list_r2.add(index, Integer.parseInt(tmp[1]));
            }
            List<Integer> list_sorted_by_h_h = new ArrayList<Integer>();
            List<Integer> list_sorted_by_h_r = new ArrayList<Integer>();
            List<Integer> list_sorted_by_r_h = new ArrayList<Integer>();
            List<Integer> list_sorted_by_r_r = new ArrayList<Integer>();
            int i1=0,i2=0;
            for(i=0;i<list_h1.size()+list_h2.size();i++){
                if(list_h1.size()==i1){
                    if(list_sorted_by_h_r.size()==0||list_r2.get(i2)>list_sorted_by_h_r.get(list_sorted_by_h_r.size()-1)){
                        list_sorted_by_h_h.add(list_h2.get(i2));
                        list_sorted_by_h_r.add(list_r2.get(i2));
                    }
                    i2++;
                }else if(list_h2.size()==i2){
                    if(list_sorted_by_h_r.size()==0||list_r1.get(i1)>list_sorted_by_h_r.get(list_sorted_by_h_r.size()-1)){
                        list_sorted_by_h_h.add(list_h1.get(i1));
                        list_sorted_by_h_r.add(list_r1.get(i1));
                    }
                    i1++;
                }else{
                    if(list_h1.get(i1)<list_h2.get(i2)){
                        if(list_sorted_by_h_r.size()==0||list_r1.get(i1)>list_sorted_by_h_r.get(list_sorted_by_h_r.size()-1)){
                            list_sorted_by_h_h.add(list_h1.get(i1));
                            list_sorted_by_h_r.add(list_r1.get(i1));
                        }
                        i1++;
                    }else if(list_h1.get(i1)>list_h2.get(i2)){
                        if(list_sorted_by_h_r.size()==0||list_r2.get(i2)>list_sorted_by_h_r.get(list_sorted_by_h_r.size()-1)){
                            list_sorted_by_h_h.add(list_h2.get(i2));
                            list_sorted_by_h_r.add(list_r2.get(i2));
                        }
                        i2++;
                    }else{
                        if(list_r2.get(i2)>list_r1.get(i1)){
                            if(list_sorted_by_h_r.size()==0||list_r1.get(i1)>list_sorted_by_h_r.get(list_sorted_by_h_r.size()-1)){
                                list_sorted_by_h_h.add(list_h1.get(i1));
                                list_sorted_by_h_r.add(list_r1.get(i1));
                            }
                        } else {
                            if(list_sorted_by_h_r.size()==0||list_r2.get(i2)>list_sorted_by_h_r.get(list_sorted_by_h_r.size()-1)){
                                list_sorted_by_h_h.add(list_h2.get(i2));
                                list_sorted_by_h_r.add(list_r2.get(i2));
                            }
                        }
                        i++;
                        i1++;
                        i2++;
                    }
                }
            }
            i1=0;i2=0;
            for(i=0;i<list_h1.size()+list_h2.size();i++){
                if(list_r1.size()==i1){
                    if(list_sorted_by_r_h.size()==0||list_h2.get(i2)>list_sorted_by_r_h.get(list_sorted_by_r_h.size()-1)){
                        list_sorted_by_r_r.add(list_r2.get(i2));
                        list_sorted_by_r_h.add(list_h2.get(i2));
                    }
                    i2++;
                }else if(list_r2.size()==i2){
                    if(list_sorted_by_r_h.size()==0||list_h1.get(i1)>list_sorted_by_r_h.get(list_sorted_by_r_h.size()-1)){
                        list_sorted_by_r_r.add(list_r1.get(i1));
                        list_sorted_by_r_h.add(list_h1.get(i1));
                    }
                    i1++;
                }else{
                    if(list_r1.get(i1)<list_r2.get(i2)){
                        if(list_sorted_by_r_h.size()==0||list_h1.get(i1)>list_sorted_by_r_h.get(list_sorted_by_r_h.size()-1)){
                            list_sorted_by_r_r.add(list_r1.get(i1));
                            list_sorted_by_r_h.add(list_h1.get(i1));
                        }
                        i1++;
                    }else if(list_r1.get(i1)>list_r2.get(i2)){
                        if(list_sorted_by_r_h.size()==0||list_h2.get(i2)>list_sorted_by_r_h.get(list_sorted_by_r_h.size()-1)){
                            list_sorted_by_r_r.add(list_r2.get(i2));
                            list_sorted_by_r_h.add(list_h2.get(i2));
                        }
                        i2++;
                    }else{
                        if(list_h2.get(i2)>list_h1.get(i1)){
                            if(list_sorted_by_r_h.size()==0||list_h1.get(i1)>list_sorted_by_r_h.get(list_sorted_by_r_h.size()-1)){
                                list_sorted_by_r_r.add(list_r1.get(i1));
                                list_sorted_by_r_h.add(list_h1.get(i1));
                            }
                        } else {
                            if(list_sorted_by_r_h.size()==0||list_h2.get(i2)>list_sorted_by_r_h.get(list_sorted_by_r_h.size()-1)){
                                list_sorted_by_r_r.add(list_r2.get(i2));
                                list_sorted_by_r_h.add(list_h2.get(i2));
                            }
                        }
                        i++;
                        i1++;
                        i2++;
                    }
                }
            }
            System.out.println(calcSize(list_sorted_by_h_h,list_sorted_by_h_r,list_sorted_by_r_h,list_sorted_by_r_r));
            count = Integer.parseInt(r.readLine().split(" ")[0]);
        }
    }

    private static int calcSize(List<Integer> h_h, List<Integer> h_r, List<Integer> r_h, List<Integer> r_r){
        int count=0;
        List<Integer> indexes1 = new ArrayList<Integer>();
        List<Integer> indexes2 = new ArrayList<Integer>();
        for(int i:h_h){
            int index = r_h.indexOf(i);
            if(index!=-1&&r_r.get(index)==h_r.get(count)){
                indexes1.add(count);
                indexes2.add(index);
            }
            count++;
        }
        if(indexes1.size()<=1){
            return Math.max(indexes1.size(), indexes2.size());
        } else {
            int i;
            int size=0;
            int prev1=0,prev2=0;
            for(i=0;i<indexes1.size();i++){
                if(indexes1.get(i)-prev1>indexes2.get(i)-prev2){
                    size+=indexes1.get(i)-prev1;
                } else {
                    size+=indexes2.get(i)-prev2;
                }
                prev1=indexes1.get(i);
                prev2=indexes2.get(i);
            }
            size+=Math.max(h_h.size()-prev1,r_h.size()-prev2);
            return size;
        }
    }
}