public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //br.readLine(); return String one line.
        //Integer.parseInt(); String to Integer(Primitive).
        //String[] hoge = str.split(" ", 0);
        String[] NX = br.readLine().split(" ", 0);
        String[] aStr = br.readLine().split(" ", 0);
        LinkedList<Integer> a = new LinkedList<>();
        for(int i = 0; i < Integer.parseInt(NX[0]); i++){
            a.add(Integer.parseInt(aStr[i]));
        }
        a = sort(a);
        int X = Integer.parseInt(NX[1]);
        int counter = 0;
        for(int i = 0; i < Integer.parseInt(NX[0]); i++) {
            X -= a.get(i);
            if(X < 0){
                break;
            }
            counter ++;
        }
        if(X > 0) counter --;
        System.out.println(counter);
    }

    public static LinkedList<Integer> sort(LinkedList<Integer> linkedList){
        //conquer finish
        if(linkedList.size() <= 1){
            return linkedList;
        }
        //pivot select
        Random rmg = new Random();
        int pivId = rmg.nextInt(linkedList.size());
        //divide
        LinkedList<Integer> leftPart = new LinkedList<Integer>();
        LinkedList<Integer> rightPart = new LinkedList<Integer>();
        int temp = linkedList.get(pivId);
        //left and right added
        for(int i = 0; i < linkedList.size(); i ++){
            if(i == pivId) continue;
            if(linkedList.get(i) < temp){
                leftPart.add(linkedList.get(i));
            } else{
                rightPart.add(linkedList.get(i));
            }
        }
        //conquer
        leftPart = sort(leftPart);
        rightPart = sort(rightPart);
        //combine to one linkedlist
        for(int i = 0; i < leftPart.size(); i ++){
            linkedList.set(i, leftPart.get(i));
        }
        linkedList.set(leftPart.size(), temp);
        for(int i = leftPart.size(); i < linkedList.size() - 1; i ++){
            linkedList.set(i, rightPart.get(i - leftPart.size()));
        }
        return linkedList;
    }