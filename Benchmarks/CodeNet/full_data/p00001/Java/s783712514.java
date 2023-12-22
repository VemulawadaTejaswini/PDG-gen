num=[]

for i in 0...10
num[i]=ARGV[i].to_i
end

num.sort!;num.reverse!

for i in 0...3
    puts num[i]
end