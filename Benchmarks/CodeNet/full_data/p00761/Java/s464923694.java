import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (true){
            int a=scan.nextInt();
            int l=scan.nextInt();
            if(a==0 && l==0){
                break;
            }
            List<Integer> list=new ArrayList();
            int data=a;
            while (true){
                list.add(data);
                if(isEqual(list)){
                    break;
                }
                List<Integer> sortList=new ArrayList();
                for(int i=0;i<l;i++){
                    try {
                        String temp = String.valueOf(list.get(list.size() - 1)).charAt(i)+"";
                        sortList.add(Integer.valueOf(temp));
                    }
                    catch (Exception e){
                        sortList.add(0);
                    }
                }
                Collections.sort(sortList,Collections.reverseOrder());
                String max="",min="";
                for(int i=0;i<l;i++){
                    max=max+sortList.get(i);
                    min=sortList.get(i)+min;
                }
                data= Integer.parseInt(max)-Integer.parseInt(min);
                //System.out.println(sortList);
                //System.out.println("max="+max+":min="+min);
            }
        }
    }
    private static boolean isEqual(List<Integer> list){
        for(int i=0;i<list.size();i++){
            int find=list.get(i);
            list.set(i,-1);
            if(list.indexOf(find)!=-1){
                System.out.println(i+" "+find+" "+(list.indexOf(find)-i));
                return true;
            }
            list.set(i,find);
        }
        return false;
    }
}
