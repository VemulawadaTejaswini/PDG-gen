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

        int i;
        boolean flg = true;
        while(flg) {
            flg = true;
            for (i=0;i<list.length-1;i++) {
                if (list[i] < list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp
                    flg = false;
                }
            }
        }
        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);
    }
}