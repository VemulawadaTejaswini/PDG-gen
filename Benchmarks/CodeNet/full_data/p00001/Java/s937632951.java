class Main{
    public static void main(String[] a){
        int list[] = {
              1819
            , 2003
            , 876
            , 2840
            , 1723
            , 1673
            , 3776
            , 2848
            , 1592
            , 922
        };

        int index;
        for(index=0;index<3;index++) {
            int max = 0;
            int index2;
            int maxIndex = 0;
            for(index2=0;index2<list.length;index2++) {
              if (list[index2] > max) {
                 max = list[index2];
                 maxIndex = index2;
              }
            }
            list[maxIndex] = 0;
            System.out.println(max);
        }
    }
}