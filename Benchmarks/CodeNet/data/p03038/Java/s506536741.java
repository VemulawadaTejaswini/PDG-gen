

import java.util.*;





 class Main {

    private static void heapify(int[] s, int index, int size){
        int left = index*2+1;
        int right = index*2+2;
        int min= s[index];
        int newIndex=-1;
        if(left<size  && s[left] < min){
            min=s[left];
            newIndex=left;
        }
        if(right<size &&  s[right]< min){
            min=s[right];
            newIndex=right;
        }


        if(min!=s[index]){
            int temp=s[index];
            s[index]=min;
            s[newIndex] =temp;
            heapify(s, newIndex, size);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        int m= in.nextInt();
        int [] heap = new int [n];

        Map<Integer, Integer>  map = new HashMap<>();
        for(int i=0;i<n;i++){
            heap[i] = in.nextInt();

        }

        for(int i=n/2;i>=0;i--){
            heapify(heap, i,n);
        }


        for(int i=0;i<m;i++){

            int elems=in.nextInt();
            int replaceWith = in.nextInt();
            map.put(elems, replaceWith);
            for(int j=0;j<elems;j++){
                int min = heap[0];
                if(min<replaceWith){
                    heap[0]=map.get(elems);
                    heapify(heap, 0,n);
                }
                else
                    break;
            }



        }
//        Map<Integer, Integer> sorted =  map
//                .entrySet()
//                .stream()
//                .sorted(comparingByValue())
//                .collect(
//                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
//                                LinkedHashMap::new));

//        List<Integer> list = new ArrayList(map.keySet());
//        Collections.sort(list, Collections.reverseOrder());
//        Set<Integer> resultSet = new LinkedHashSet(list);
//        Set<Integer> resultSet = map.keySet();
//        System.out.println(resultSet);
//        for(Integer elems: resultSet){
//                for(int i=0;i<elems;i++){
//                    int min = heap[0];
//                    if(min<map.get(elems)){
//                        heap[0]=map.get(elems);
//                        heapify(heap, 0,n);
//                    }
//                }
//
//        }
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=heap[i];

        }
        System.out.println(sum);

    }
}
