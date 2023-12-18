public static void main(String[] args){
        try {
                int s, w;
                String[] list;
                String result;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                list = br.readLine().split("\\s");
                s = Integer.parseInt(list[0]);
                w = Integer.parseInt(list[1]);
                if (s <= w) {
                    System.out.println("unsafe");
                } else {
                    System.out.println("safe");
                }
            }catch(IOException e)
            {
                e.printStackTrace();
            }
            }
        }