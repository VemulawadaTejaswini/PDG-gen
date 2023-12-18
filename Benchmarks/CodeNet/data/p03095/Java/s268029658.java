 static void Main(string[] args)
        {
            string input = "abcda";
            int len = input.Length;
            List<string> result = new List<string>();
            Dictionary<int, List<string>> dic = new Dictionary<int, List<string>>();

            for (int i = len - 1; i >= 0; i--) {
                List<string> list = new List<string>();
                string c = input.Substring(i, 1);
                list.Add(c);
                result.Add(c);
                for (int j = i + 1; j <= len - 1; j++) {
                    if (dic.ContainsKey(j)) {
                        var temp = dic[j];
                        foreach (var data in temp) {
                            if (data.IndexOf(c) >= 0) {
                                continue;
                            }
                            var word = c + data;
                            list.Add(word);
                            result.Add(word);
                        }
                    }
                }
                dic.Add(i, list);
            }


            return;

        }