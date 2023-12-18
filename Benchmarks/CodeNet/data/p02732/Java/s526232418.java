

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        HashMap<Integer,Long> ans=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> hashSet=new HashSet<>();
        for(int j=0;j<n;j++){
            arr[j]=scanner.nextInt();
            if(hashMap.get(arr[j])==null){
                hashMap.put(arr[j],1);
            }
            else{
                hashMap.put(arr[j],hashMap.get(arr[j])+1);
                if(!hashSet.contains(arr[j])) {
                    list.add(arr[j]);
                    hashSet.add(arr[j]);
                }
            }
        }
        long tot=0;
        for(int i=0;i<list.size();i++){

                //tot+=(long)((long)(hashMap.get(list.get(i))-1)*(long)(hashMap.get(list.get(i))-2))/(long)2;
                tot+=(long)((long)(hashMap.get(list.get(i))-1)*(long)(hashMap.get(list.get(i))))/(long)2;


        }
        for(int j=0;j<n;j++)
        {
            if(ans.get(arr[j])==null){
                long tott=0;
                if(hashMap.get(arr[j])==1){
                    tott=tot;
                }
                else {
                    tott = (long)tot - (long)((hashMap.get(arr[j]) - 1) * (hashMap.get(arr[j])))/2 +
                            (long)((hashMap.get(arr[j]) - 1) * (hashMap.get(arr[j])-2))/2 ;
                }
                ans.put(arr[j],tott);
                System.out.println(tott);
            }
            else{
                System.out.println(ans.get(arr[j]));
            }
        }

    }
}
